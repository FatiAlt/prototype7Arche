// import React, {  useState } from "react";
// import axios from './api/axios';



// function LoginForm() {
//     // const [personne, setPersonne] = useState({
//     //     email: '',
//     //     password: '',
   
//     // });
//     const [email, setEmail] = useState("f.kaaouan@laposte.net");
//     const [password, setPassword] = useState("123456AZKDFHJ");
//     const [error, setError] = useState(null); // État pour stocker le message d'erreur

//     // const handleChange(event) => {
//     //     let value = event.target.value;
//     //     setEmail(value);
//     //      setPassword(value);

//     // }


//     const handleSubmit = async (e) => {
//         e.preventDefault();
//         //soumission du formulaire
//         // const user = {
//         //     name: this.state.name
//         // };

//     try {
//         //envoyer les données du formulaire au back
//         const response = await axios.post('http://localhost:8080/clients' , email, password);
//         //si l'authentification réussit, action affichage sur la console
//         console.log('Authentification réussie !', response.data);
//         //rediriger l'utilisateur vers la page panier ou mettre à jour l'état d'authentification 
//     } catch (error) {
//         //gérer les erreurs dans la console
//         console.error('Erreur d\'authentification :', error.message);
//         //Affichez un message d'erreur (mot de passe érroné)
//     }
//     // Ici, vous pouvez gérer la soumission du formulaire d'inscription, par exemple, en appelant une fonction d'inscription.
//     setError('Nom d\'utilisateur ou mot de passe incorrect.'); // Définit le message d'erreur

// }
// return (
//     <div>
//       <h2>Connexion</h2>
//       {error && <p style={{ color: 'red' }}>{error}</p>} {/* Affiche le message d'erreur s'il existe */}
//       <form onSubmit={handleSubmit}>
//         {/* ... */}
//       </form>
//     </div>
//   );
// }
//             <div>
//             <h2>Connexion</h2>
//                 <form onSubmit={this.handleSubmit}>
//                     <div>
//                         <label For="email">Email :</label>
//                         <input
//                             type="email"
//                             id="email"
//                             name="email"
//                             value={email}
//                             onChange={this.handleChange}
//                             required
//                             />
//                     </div>
//                     <div>
//                         <label For="password">Mot de passe :</label>
//                         <input
//                             type="password"
//                             id="password"
//                             name="password"
//                             value={motDePasse}
//                             onChange={this.handleChange}
//                             required
//                             />
//                     </div>
//                     <button type="submit">Se connecter</button>
//                 </form>

            
//         </div>
        



// export default LoginForm;