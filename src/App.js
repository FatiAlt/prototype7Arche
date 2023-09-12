
import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Logo from './components/logo/Logo';
import NavBar from './components/navBar/NavBar';
import Home from './pages/home/Home';


const App = () => {
  return (


      <BrowserRouter>
      <Routes>
      <Route path="/" element={<Home />}/>

      {/* path="*" fonctionne si jamais l'url ne correspond à rien de déclaré a dessus */}
      <Route path="*" element={<Home />}/>
      <Route path='logo' element={<Logo />}/>
      <Route path='nav' element={<NavBar />}/>



      </Routes>
      </BrowserRouter>


  );
};

export default App;
