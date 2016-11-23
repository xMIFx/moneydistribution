"use strict";

var gulp = require('gulp');
var connect = require('gulp-connect'); // Runs a local dev server
var open = require('gulp-open'); // Opens URL in a web browser
var concat = require('gulp-concat'); // Concat CSS
var browserify = require('browserify'); // Bundles JS
var source = require('vinyl-source-stream'); // Use text streams with Gulp
var eslint = require('gulp-eslint'); // Code style

var config = {
  port: 9005,
  devBaseUrl: 'http://localhost',
  paths: {
    html: './src/**/*.html',
    js: './src/**/*.js',
    css: './src/**/*.css',
    bootstrapCss: './node_modules/bootstrap/dist/css/bootstrap.min.css',
    reactDateTimePickerCss: './node_modules/react-datepicker/dist/react-datepicker.min.css',
    bootstrapThemeCss: './node_modules/bootstrap/dist/css/bootstrap.theme.min.css',
    bootstrapFonts: './node_modules/bootstrap/dist/fonts/*.{eot,svg,ttf,woff,woff2}',
    bootstrapJs: './node_modules/bootstrap/dist/js/bootstrap.min.js',
    jquery: './node_modules/jquery/dist/jquery.min.js',
    cometd: './node_modules/cometd-jquery/org/cometd.js',
    jCometd: './node_modules/cometd-jquery/jquery/jquery.cometd.js',
    lib: './lib/**/*.js',
    dist: './../webapp',
    mainJs: './src/main.js'
  }
};

//Start a local dev server
gulp.task('connect', function() {
  connect.server({
    root: [config.paths.dist],
    port: config.port,
    base: config.devBaseUrl,
    livereload: true
  })
});

gulp.task('open', ['connect'], function() {
  gulp.src(config.paths.dist + '/index.html')
      .pipe(open({uri: config.devBaseUrl + ':' + config.port + '/'}));
});

gulp.task('html', function() {
  gulp.src(config.paths.html)
      .pipe(gulp.dest(config.paths.dist))
      .pipe(connect.reload());
});

gulp.task('js', function() {
  browserify(config.paths.mainJs)
      .transform("babelify", {presets: ["es2015", "react"]})
      .bundle()
      .on('error', console.error.bind(console))
      .pipe(source('app.js'))
      .pipe(gulp.dest(config.paths.dist + '/resources/js'))
      .pipe(connect.reload());
  gulp.src([config.paths.jquery, config.paths.bootstrapJs, config.paths.lib, config.paths.cometd, config.paths.jCometd])
      .pipe(concat('bundle.js'))
      .pipe(gulp.dest(config.paths.dist + '/resources/js'));
});

gulp.task('css', function() {
  return gulp.src([config.paths.bootstrapCss, config.paths.bootstrapThemeCss, config.paths.css, config.paths.reactDateTimePickerCss])
      .pipe(concat('bundle.css'))
      .pipe(gulp.dest(config.paths.dist + '/resources/css'))
      .pipe(connect.reload());
});

gulp.task('fonts', function() {
  return gulp.src(config.paths.bootstrapFonts)
      .pipe(gulp.dest(config.paths.dist + '/resources/fonts/'));
});

gulp.task('watch', function() {
  gulp.watch(config.paths.html, ['html']);
  gulp.watch(config.paths.css, ['css']);
  gulp.watch(config.paths.js, ['js', 'lint']);
});

gulp.task('lint', function() {
  return gulp
      .src(config.paths.js)
      .pipe(eslint())
      .pipe(eslint.format());
});

gulp.task('default', ['html', 'js', 'css', 'lint', 'fonts', 'open', 'watch']);