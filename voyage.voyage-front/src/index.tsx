// alert("Le js s'est bien loadé");

// function hello(word) {
//     alert(word);
// }

// function helloTS(word:string) {
//     alert(word);
// }

// hello('Salut');
// helloTS('salut');

// J'importe React
import * as React from 'react'
import * as ReactDOM from 'react-dom'

//On importe le composant App
import App from "./app";

// Imports bootstrap :
import 'bootstrap/dist/css/bootstrap.css';
import "bootstrap/dist/css/bootstrap.min.css";

// imports mdb react :
import '@fortawesome/fontawesome-free/css/all.min.css';
import 'bootstrap-css-only/css/bootstrap.min.css';
import 'mdbreact/dist/css/mdb.css';

//On stock dans la variable MOUNT_NODE, l'élément HTML dans lequelle on va monter l'application REACT
const MOUNT_NODE = document.getElementById("app");

//ReactDOM va générer un DOM virtuel à partir de notre MOUNT_NODE
ReactDOM.render(<App/>, MOUNT_NODE);


