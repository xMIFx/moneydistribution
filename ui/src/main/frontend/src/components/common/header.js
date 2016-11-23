"use strict";
import React from "react";
import {Link} from "react-router";
export default class Header extends React.Component {
    render() {
        return <nav calssName="navbar navbar-default">
            <div className="container-fluid">
                <a href = "/" className="navbar-brand">
                    <img src = "resources/images/pluralsight.png"/>
                </a>
                <ul className="nav navbar-nav">
                    <li><Link to={"/"}>Home</Link></li>
                    <li><Link to={"/about"}>About</Link></li>
                    <li><Link to={"/sign_in"}>Authors</Link></li>
                    <li><Link to={"/registration"}>Authors</Link></li>
                </ul>
            </div>
        </nav>
    }
}
