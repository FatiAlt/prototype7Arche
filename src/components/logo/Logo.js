import React from 'react';
import '../logo/_Logo.scss'
import logo from '../../assets/logo/logo.png';

const Logo = () => {
    return (
        <div className='logo'>
            {/* Les images importées depuis la balise IMG sont accessibles dans "public" */}
            <img src={logo} alt='logo' className='logo'/>
            {/* { <h3>SEPTARCHE LIBRAIRIE</h3> } */}

        </div>
    );
};

export default Logo;