import React from 'react';

const Logo = () => {
    return (
        <div className='logo'>
            {/* Les images importées depuis la balise IMG sont accessibles dans "public" */}
            <img src='./logoSeptArche.png' alt='logo'/>
            {/* <h3>React world</h3> */}

        </div>
    );
};

export default Logo;
