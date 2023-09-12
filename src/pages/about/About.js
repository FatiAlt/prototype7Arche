import React from 'react';
import Logo from '../../components/logo/Logo';
import NavBar from '../../components/navBar/NavBar';


const About = () => {
    return (
        <div>

            <Logo />
            <NavBar />
            <h1>A propos</h1>
            <br />
            <p>La librairie a été crée en 1998, situé au 9, rue des champs élysée à Paris, nous proposons un large
                choix de livres spécialisée dans le cinéma ainsi que quelques articles.
            </p>

            <br />
            <p> Vous pouvez nous contacter à tout moment pour commander un article spécial. Vous pouvez venir nous voir
                directement en magasin ou nous contacter par mail ou par téléphone. Nous vous répondrons dans les plus brefs délais.
            </p>

        </div>
    );
};
    

export default About;
