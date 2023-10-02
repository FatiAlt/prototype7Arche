import React from 'react';
import './Cards.scss';
import './CardsItem';
import PRODUCTS from '../../Data.js'; 


 function Cards ({item, addItem}){
    const {titre, auteur, prix, img} = item || {};
    
  return (
    <div className="cards">
        <div className="image_box">
            <img src={img} alt="img" />
        </div>
        <div className="details">
            <p>{titre}</p>
            <p>{auteur}</p>
            <p>Prix {prix}€</p>
        
            <button onClick={()=>addItem(item)} >Ajouter au panier</button>
        </div>
    </div>
  )
}


export default Cards;