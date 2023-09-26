// import React, { useState } from 'react';
// import registerUser from './RegisterUser';


// function RegisterForm() {
//   const [personne, setPersonne] = useState({
//     username: '',
//     name: '',
//     firstname: '',
//     adress: '',
//     codepostale: '',
//     ville: '',
//     email: '',
//     password: '',
    
//   });

//   const handleChange = (e) => {
//     const { name, value } = e.target;
//     setPersonne({ ...personne, [name]: value });
//   };

//   const handleSubmit = async (e) => {
//     e.preventDefault();

//        // Ici, la fonction d'inscription
//        try {
//         const response = await registerUser(personne);
//         console.log('Inscription réussie !', response.data);
//         // Rediriger l'utilisateur vers une autre page ou effectuer d'autres actions appropriées après l'inscription.
//       } catch (error) {
//         console.error('Erreur lors de l\'inscription :', error.message);
//         // Afficher un message d'erreur à l'utilisateur ou effectuer d'autres actions en cas d'échec de l'inscription.
//       }
//     };

//   return (
//     <div>
//       <h2>Inscription</h2>
//       <form onSubmit={this.handleSubmit}>
//         <div>
//           <label htmlFor="username">Nom d'utilisateur :</label>
//           <input
//             type="text"
//             id="username"
//             name="username"
//             value={personne.username}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="name">Nom  :</label>
//           <input
//             type="text"
//             id="name"
//             name="name"
//             value={personne.name}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="firstname">Prénom  :</label>
//           <input
//             type="text"
//             id="firstname"
//             name="firstname"
//             value={personne.firstname}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="adress">Adresse  :</label>
//           <input
//             type="text"
//             id="adress"
//             name="adress"
//             value={personne.adress}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="codepostale">Code Postale  :</label>
//           <input
//             type="number"
//             id="codepostale"
//             name="codepostale"
//             value={personne.codepostale}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="ville">Ville  :</label>
//           <input
//             type="text"
//             id="ville"
//             name="ville"
//             value={personne.ville}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="email">Email :</label>
//           <input
//             type="email"
//             id="email"
//             name="email"
//             value={personne.email}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <div>
//           <label htmlFor="password">Mot de passe :</label>
//           <input
//             type="password"
//             id="password"
//             name="password"
//             value={personne.password}
//             onChange={this.handleChange}
//             required
//           />
//         </div>
//         <button type="submit">S'inscrire</button>
//       </form>
//     </div>
//   );
// }


// export default RegisterForm;
