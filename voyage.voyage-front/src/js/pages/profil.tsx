
import React from 'react'

class ProfilPage extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: "",
      firstName:"", 
      lastName:"",
      isLoaded: false,
    }
  }

  componentDidMount() {
    const userId = localStorage.getItem("user_id");
            alert( "id user: " + userId);
    
    const url = "http://localhost:8282/api/account/get/" + userId;
    
    const headers = new Headers({
                        "Accept": "application/json",
                      "Content-Type": "application/json"});
                
                      fetch( url, {
                        method: "GET",
                        headers,
                        mode: "cors"
                      })
      .then(res => {return res.json();})
      .then(json => {
        this.setState({
          isLoaded: true,
          username: json.username,
          firstName: json.firstName, 
          lastName: json.lastName
            })
      });
      // alert(this.state.username);
  }
  render() {
    const username = this.state.username;
    const firstName = this.state.firstName;
    const lastName = this.state.lastName;

      return (
        <React.Fragment>
        <div >
         <h1><strong>Nom d'utilisateur : {username}</strong></h1>
         <h2>Nom : {firstName}</h2>
         <h2>Prénom : {lastName}</h2>
      </div>
      </React.Fragment>
      )
    
  }
}
export default ProfilPage;
// import React from "react";
// import ReactDOM from "react-dom";


// class ProfilPage extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = {
//       repos: []
//     };
//   }


//   handleClick() {

//     const userId = localStorage.getItem("user_id");
//         // alert( "id user: " + userId);

//     const url = "http://localhost:8282/api/account/get/" + userId;

//     fetch(url)
//       .then(res => res.json())
//       .then(repos => {
//         this.setState({ repos });
//       });
//       alert(res);
//   }
//   render() {
//     const { repos : repos } = this.state;
//     return (
//       <div className="App">
//         <h1>Github Repos</h1>
//         <button onClick={e => this.handleClick(e)}>Get Repos!</button>
//         <ul>
//           {repos.map(repo => (
//             <li>{repo.firstName}</li>
//           ))}
//         </ul>
//       </div>
//     );
//   }
// }

// export default ProfilPage;

// import React from "react";
// import {  MDBRow, MDBCol, MDBCard, MDBCardBody, MDBMask, MDBIcon, MDBView } from "mdbreact";
// // import ls from 'local-storage';

// class ProfilPage extends React.Component {

//   constructor(props) {
//     super(props);
//     this.state = {
//       repos: []
//     };
//   }

  

//   componentDidMount() {
//     // const userId = localStorage.getItem("access_token".valueOf("USER_ID_KEY"));
//     // // const ul = userData.valueOf(id);
//     // const userStorage = localStorage.getItem("access_token");
    
//     const userId = localStorage.getItem("user_id");
//     alert( "id user: " + userId);

//     const url = "http://localhost:8282/api/account/get/" + userId;
    
//     const headers = new Headers({
//                   // "Accept": "application/json",
//                 "Content-Type": "application/json"});
          
//                 fetch( url, {
//                   method: "GET",
//                   headers,
//                   mode: "cors"
//                 })

//     // fetch("http://localhost:8282/api/get/" + userId )
//       .then(res => res.json())
//       .then(data => this.setState({ repos: data.repos }));
//       // .then( repos => {
//       //   this.setState({ repos });
//       //   alert(repos);
//       // });
//   }

  

//   render() {

//     const { repos } = this.state;

//       return (
    
    
//         <MDBCard
//             className="my-5 px-5 mx-auto"
//             style={{ fontWeight: 300, maxWidth: "90%" }}
//           >
//             <MDBCardBody style={{ paddingTop: 0 }}>
//               <h2 className="h1-responsive font-weight-bold my-5 text-center">
//                 Mon profil
//               </h2>
//               {/* <textarea
//               value={this.state.repos}></textarea> */}
//       <ul>
//         {repos.map(repo => (
//           <li>{repo.username}</li>
//         ))}
//       </ul> 
              
//               <MDBRow>
//                 <MDBCol md="12" lg="6">
//                   <div className="mb-4">
//                     <MDBView hover rounded className="z-depth-1-half mb-4">
//                       <img
//                         className="img-fluid"
//                         src="https://mdbootstrap.com/img/Photos/Slides/1.jpg"
//                         alt=""
//                       />
//                       <a href="#!">
//                         <MDBMask overlay="white-slight" className="waves-light" />
//                       </a>
//                     </MDBView>
//                     <div className="d-flex justify-content-between">
//                       <a href="#!" className="deep-orange-text">
//                         <h6 className="font-weight-bold">
//                           <MDBIcon icon="utensils" className="pr-2" />
//                           Culinary
//                         </h6>
//                       </a>
//                       <p className="font-weight-bold dark-grey-text">
//                         <MDBIcon far icon="clock" className="pr-2" />
//                         27/02/2018
//                       </p>
//                     </div>
//                     <h3 className="font-weight-bold dark-grey-text mb-3 p-0">
//                       <a href="#!">Title of the news</a>
//                     </h3>
//                     <p className="dark-grey-text mb-lg-0 mb-md-5 mb-4">
//                       Sed ut perspiciatis unde voluptatem omnis iste natus error sit
//                       voluptatem accusantium doloremque laudantium, totam rem
//                       aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
//                       architecto beatae vitae explicabo. Duis aute irure dolor in
//                       reprehenderit in voluptate velit esse cillum dolore eu fugiat.
//                     </p>
//                   </div>
//                 </MDBCol>
    
//                 <MDBCol md="12" lg="6">
//                   <div style={{
//                     borderBottom: "1px solid #e0e0e0",
//                     marginBottom: "1.5rem"
//                   }}>
//                     <MDBRow>
//                       <MDBCol md="3">
//                         <MDBView hover rounded className="z-depth-1-half mb-4">
//                           <img
//                             className="img-fluid"
//                             src="https://mdbootstrap.com/img/Photos/Others/img%20(29).jpg"
//                             alt=""
//                           />
//                           <a href="#!">
//                             <MDBMask overlay="white-slight" className="waves-light" />
//                           </a>
//                         </MDBView>
//                       </MDBCol>
//                       <MDBCol md="9">
//                         <p className="font-weight-bold dark-grey-text">
//                           26/02/2018
//                         </p>
//                         <div className="d-flex justify-content-between">
//                           <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                             <a href="#!" className="dark-grey-text">
//                               At vero eos et accusamus et iusto odio dignissimos
//                               ducimus qui blanditiis
//                             </a>
//                           </MDBCol>
//                           <a href="#!">
//                             <MDBIcon icon="angle-double-right" />
//                           </a>
//                         </div>
//                       </MDBCol>
//                     </MDBRow>
//                   </div>
    
//                   <div style={{
//                     borderBottom: "1px solid #e0e0e0",
//                     marginBottom: "1.5rem"
//                   }}>
//                     <MDBRow>
//                       <MDBCol md="3">
//                         <MDBView hover rounded className="z-depth-1-half mb-4">
//                           <img
//                             className="img-fluid"
//                             src="https://mdbootstrap.com/img/Photos/Horizontal/Food/4-col/img%20(45).jpg"
//                             alt=""
//                           />
//                           <a href="#!">
//                             <MDBMask overlay="white-slight" className="waves-light" />
//                           </a>
//                         </MDBView>
//                       </MDBCol>
//                       <MDBCol md="9">
//                         <p className="font-weight-bold dark-grey-text">
//                           25/02/2018
//                         </p>
//                         <div className="d-flex justify-content-between">
//                           <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                             <a href="#!" className="dark-grey-text">
//                               Itaque earum rerum hic tenetur a sapiente delectus
//                             </a>
//                           </MDBCol>
//                           <a href="#!">
//                             <MDBIcon icon="angle-double-right" />
//                           </a>
//                         </div>
//                       </MDBCol>
//                     </MDBRow>
//                   </div>
    
//                   <div style={{
//                         borderBottom: "1px solid #e0e0e0",
//                         marginBottom: "1.5rem"
//                       }}>
//                     <MDBRow>
//                       <MDBCol md="3">
//                         <MDBView hover rounded className="z-depth-1-half mb-4">
//                           <img
//                             className="img-fluid"
//                             src="https://mdbootstrap.com/img/Photos/Others/images/87.jpg"
//                             alt=""
//                           />
//                           <a href="#!">
//                             <MDBMask overlay="white-slight" className="waves-light" />
//                           </a>
//                         </MDBView>
//                       </MDBCol>
//                       <MDBCol md="9">
//                         <p className="font-weight-bold dark-grey-text">
//                           24/03/2018
//                         </p>
//                         <div className="d-flex justify-content-between">
//                           <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                             <a href="#!" className="dark-grey-text">
//                               Soluta nobis est eligendi optio cumque nihil impedit
//                               quo minus
//                             </a>
//                           </MDBCol>
//                           <a href="#!">
//                             <MDBIcon icon="angle-double-right" />
//                           </a>
//                         </div>
//                       </MDBCol>
//                     </MDBRow>
//                   </div>
    
//                   <div className="mb-4">
//                     <MDBRow>
//                       <MDBCol md="3">
//                         <MDBView hover rounded className="z-depth-1-half mb-4">
//                           <img
//                             className="img-fluid"
//                             src="https://mdbootstrap.com/img/Photos/Others/img%20(27).jpg"
//                             alt=""
//                           />
//                           <a href="#!">
//                             <MDBMask overlay="white-slight" className="waves-light" />
//                           </a>
//                         </MDBView>
//                       </MDBCol>
//                       <MDBCol md="9">
//                         <p className="font-weight-bold dark-grey-text">
//                           23/02/2018
//                         </p>
//                         <div className="d-flex justify-content-between">
//                           <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                             <a href="#!" className="dark-grey-text">
//                               Duis aute irure dolor in reprehenderit in voluptate
//                             </a>
//                           </MDBCol>
//                           <a href="#!">
//                             <MDBIcon icon="angle-double-right" />
//                           </a>
//                         </div>
//                       </MDBCol>
//                     </MDBRow>
//                   </div>
//                 </MDBCol>
//               </MDBRow>
//             </MDBCardBody>
//           </MDBCard>
//       );
//     }
//     }
    
//     export default ProfilPage;

//////////////////////


//       .then(response => response.json())
//       // ...then we update the users state
//       .then(data =>
//         this.setState({
//           users: data,
//           isLoading: false,
//         })
//       )
//       // Catch any errors we hit and update the app
//       .catch(error => this.setState({ error, isLoading: false }));
//   }
//   render() {
//     const { isLoading, users, error } = this.state;
//     return (
//       <React.Fragment>
//         <h1>Infos profil</h1>
//         // Display a message if we encounter an error
//         {error ? <p>{error.message}</p> : null}
//         // Here's our data check
//         {!isLoading ? (
//           users.map(user => {
//             const { username, firstName, email } = user;
//             return (
//               <div key={username}>
//                 <p>Name: {firstName}</p>
//                 <p>Email Address: {email}</p>
//                 <hr />
//               </div>
//             );
//           })
//         // If there is a delay in data, let's let the user know it's loading
//         ) : (
//           <h3>Loading...</h3>
//         )}
//       </React.Fragment>
//     );
//   }
// }

// export default ProfilPage;

/////////////////////

      // // ./pages/dashboard.js
// // example of a protected page
// import React from 'react';
// import withAuth from  '../components/withAuth';

// class Dashboard extends React.Component {
//    render() {
//      const user = this.props.auth.getProfil()
//      return (   
//          <div>Current user: {user.username}</div>
//      )
//    }
// }

// export default withAuth(Dashboard);


// import React from 'react';


// class Profil extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { query: '', hits: [] };
//   }

//   // componentDidMount() {
//   //   let user = JSON.parse( sessionStorage.user );
//   // }
//   onChange = event => {
//     this.setState({ query: event.target.value });
//   };
//   onSearch = event => {
//     event.preventDefault();
//     const { query } = this.state;
//     if (query === '') {
//       return;
//     }
    
    
    
//     alert("username = " + localStorage.getItem("username"));

//     fetch('http://localhost:8282/api/account/get/' + query)
//       .then(response => response.json())
//       .then(result => this.onSetResult(result, query));
//   };
//   onSetResult = (result, key) => {
//     this.setState({ hits: result.hits });
//   };
//   let user = JSON.parse( daty );



/////////////////

// import React from 'react';
// class App extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { query: '', hits: [] };
//   }
//   onChange = event => {
//     this.setState({ query: event.target.value });
//   };
//   onSearch = event => {
//     event.preventDefault();
//     const { query } = this.state;
//     if (query === '') {
//       return;
//     }
//     const cachedHits = localStorage.getItem(query);
//     if (cachedHits) {
//       this.setState({ hits: JSON.parse(cachedHits) });
//     } else {
//       fetch('"http://localhost:8282/api/account/get/' + query)
//         .then(response => response.json())
//         .then(result => this.onSetResult(result, query));
//     }
//   };
//   onSetResult = (result, key) => {
//     localStorage.setItem(key, JSON.stringify(result.hits));
//     this.setState({ hits: result.hits });
//   };
// 

///////////////////////////////

// class ProfilPage extends React.Component {
  // state = {
  //   isLoading: true,
  //   users: [],
  //   error: null
  // }

  

  // componentDidMount() {

    // function createNode(element) {
    //   return document.createElement(element); // Create the type of element you pass in the parameters
    // }
  
    // function append(parent, el) {
    //   return parent.appendChild(el); // Append the second parameter(element) to the first one
    // }
   
    // const ul = document.getElementById('accounts');
    //       localStorage.getItem("access_token");
//           let peopleZone = document.querySelector('.people-zone');
//           let peopleScreen = peopleZone.querySelector('.screen');
          
//           const userId = localStorage.getItem("user_id");
//           alert( "data " + userId);
          
//           const headers = new Headers({
//             // "Accept": "application/json",
//           "Content-Type": "application/json"});
    
//           fetch("http://localhost:8282/api/account/get/" + userId , {
//             method: "GET",
//             headers,
//             mode: "cors"
//           })
//           .then((resp) => resp.json())
//   .then((data) {

//     let account = data.results;

//     account.map((value, index)) => {
//       let firstName = value.firstName;
//       let lastName = value.lastName;
//       let username = value.username;
//       let span = document.createElement('p');
//       span.innerHTML = firstName;
//       span.innerHTML = lastName;
//       span.innerHTML = username;
//       peopleScreen.appendChild(span);
//     }
//     })
//   }

//   render() {
//     return (
//       <div>
//         <section className="people-zone">
//     <h1>People zone</h1>
//     <article className="screen">
//             <p>Luke ?!</p>
//     </article>
// </section>
//       </div>
//     )
//   }