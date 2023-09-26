
import React from 'react';
import { NavLink } from 'react-router-dom';
import '../navBar/NavBar.scss';

const NavBar = () => {
    return (
        <div>
            <div className="navigation">
            <ul>
                <NavLink to="/" className={(nav) => (nav.isActive ? "nav-active" : "")}>
                    <li>Accueil</li>
                </NavLink>
                <NavLink to="/about" className={(nav) => (nav.isActive ? "nav-active" : "")}>
                    <li>A propos</li>
                </NavLink>
                <NavLink to="/login" className={(nav) => (nav.isActive ? "nav-active" : "")}>
                    <li>Se connecter</li>
                </NavLink>
              
                <NavLink to="/contact" className={(nav) => (nav.isActive ? "nav-active" : "")}>
                    <li>Contact </li>
                </NavLink>
            
            </ul>
        </div>
        </div>
    );
};



export default NavBar;
