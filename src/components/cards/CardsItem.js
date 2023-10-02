import React from 'react';
import PRODUCTS from '../../Data.js'; 
import Cards from './Cards';

const CardsItem = ({handleClick}) => {
  return (
    <section>
        {
            PRODUCTS.map((item)=>(
                <Cards item={item} key={item.id} handleClick={handleClick} />
            ))
        }
    </section>
  )
}

export default CardsItem;