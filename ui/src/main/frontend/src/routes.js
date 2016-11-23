import React from "react";
import {Router, browserHistory, Route, IndexRoute, NoMatch} from "react-router";
import App from "./components/App";
import HomePage from "./components/homePage";
import SignIn  from "./components/signIn/signIn";
import About  from "./components/about/aboutPage";

export default class Routes extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return <Router history={browserHistory}>
      <Route path="/" component={App}>
        <IndexRoute component={HomePage}/>
        <Route path="about" component={About}/>
        <Route path="sign_in" component={SignIn}/>
        <Route path="registration" component={SignIn}/>
        <Route path="*" component={NoMatch}/>
      </Route>
    </Router>
  }
};


