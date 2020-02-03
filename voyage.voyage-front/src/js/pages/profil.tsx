

import React from 'react';
class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { query: '', hits: [] };
  }
  onChange = event => {
    this.setState({ query: event.target.value });
  };
  onSearch = event => {
    event.preventDefault();
    const { query } = this.state;
    if (query === '') {
      return;
    }
    fetch('http://localhost:8282/api/account/get/' + query)
      .then(response => response.json())
      .then(result => this.onSetResult(result, query));
  };
  onSetResult = (result, key) => {
    this.setState({ hits: result.hits });
  };
  render() {
    return (
      <div>
        <h1>Search Hacker News with Local Storage</h1>
        {/* Search Input */}
        <form onSubmit={this.onSearch}>
          <input type="text" onChange={this.onChange} />
          <button type="submit">Search</button>
        </form>
        {/* Result */}
        {this.state.hits.map(item => (
          <div key={item.id}>{item.firstName}</div>
        ))}
      </div>
    );
  }
}
export default App;

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
//   render() {
//     return (
//       <div>
//         <h1>Search Hacker News with Local Storage</h1>
//         <p>
//           There shouldn't be a second network request, when you search
//           for a keyword twice.
//         </p>
//         {/* Search Input */}
//         <form onSubmit={this.onSearch}>
//           <input type="text" onChange={this.onChange} />
//           <button type="submit">Search</button>
//         </form>
//         {/* Result */}
//         {this.state.hits.map(item => (
//           <div key={item.objectID}>{item.title}</div>
//         ))}
//       </div>
//     );
//   }
// }
// export default App;

////////////////////////////


// import React from "react";
// import {  MDBRow, MDBCol, MDBCard, MDBCardBody, MDBMask, MDBIcon, MDBView } from "mdbreact";


// class ProfilPage extends React.Component {

//     constructor(props) {
//       super(props);
//       this.state = {
//         repos: []
//       };
//     }

    

//     // componentDidMount() {

//     //   const ul = localStorage.getItem("id");

//     //   fetch("http://localhost:8282/api/account/get/" + ul)
//     //     .then(res => res.json())
//     //     .then(repos => {
//     //       this.setState({ repos });
//     //     });
//     // }

    

//     render() {

//       // const { repos } = this.state;

//         return (
      
      
//           <MDBCard
//               className="my-5 px-5 mx-auto"
//               style={{ fontWeight: 300, maxWidth: "90%" }}
//             >
//               <MDBCardBody style={{ paddingTop: 0 }}>
//                 <h2 className="h1-responsive font-weight-bold my-5 text-center">
//                   Mon profil
//                 </h2>
//                 {/* <button onClick={e => this.componentDidMount(e)}>Get Repos!</button>
//         <ul>
//           {repos.map(repo => (
//             <li>{repo.firstName}</li>
//           ))}
//         </ul> */}
                
//                 <MDBRow>
//                   <MDBCol md="12" lg="6">
//                     <div className="mb-4">
//                       <MDBView hover rounded className="z-depth-1-half mb-4">
//                         <img
//                           className="img-fluid"
//                           src="https://mdbootstrap.com/img/Photos/Slides/1.jpg"
//                           alt=""
//                         />
//                         <a href="#!">
//                           <MDBMask overlay="white-slight" className="waves-light" />
//                         </a>
//                       </MDBView>
//                       <div className="d-flex justify-content-between">
//                         <a href="#!" className="deep-orange-text">
//                           <h6 className="font-weight-bold">
//                             <MDBIcon icon="utensils" className="pr-2" />
//                             Culinary
//                           </h6>
//                         </a>
//                         <p className="font-weight-bold dark-grey-text">
//                           <MDBIcon far icon="clock" className="pr-2" />
//                           27/02/2018
//                         </p>
//                       </div>
//                       <h3 className="font-weight-bold dark-grey-text mb-3 p-0">
//                         <a href="#!">Title of the news</a>
//                       </h3>
//                       <p className="dark-grey-text mb-lg-0 mb-md-5 mb-4">
//                         Sed ut perspiciatis unde voluptatem omnis iste natus error sit
//                         voluptatem accusantium doloremque laudantium, totam rem
//                         aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
//                         architecto beatae vitae explicabo. Duis aute irure dolor in
//                         reprehenderit in voluptate velit esse cillum dolore eu fugiat.
//                       </p>
//                     </div>
//                   </MDBCol>
      
//                   <MDBCol md="12" lg="6">
//                     <div style={{
//                       borderBottom: "1px solid #e0e0e0",
//                       marginBottom: "1.5rem"
//                     }}>
//                       <MDBRow>
//                         <MDBCol md="3">
//                           <MDBView hover rounded className="z-depth-1-half mb-4">
//                             <img
//                               className="img-fluid"
//                               src="https://mdbootstrap.com/img/Photos/Others/img%20(29).jpg"
//                               alt=""
//                             />
//                             <a href="#!">
//                               <MDBMask overlay="white-slight" className="waves-light" />
//                             </a>
//                           </MDBView>
//                         </MDBCol>
//                         <MDBCol md="9">
//                           <p className="font-weight-bold dark-grey-text">
//                             26/02/2018
//                           </p>
//                           <div className="d-flex justify-content-between">
//                             <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                               <a href="#!" className="dark-grey-text">
//                                 At vero eos et accusamus et iusto odio dignissimos
//                                 ducimus qui blanditiis
//                               </a>
//                             </MDBCol>
//                             <a href="#!">
//                               <MDBIcon icon="angle-double-right" />
//                             </a>
//                           </div>
//                         </MDBCol>
//                       </MDBRow>
//                     </div>
      
//                     <div style={{
//                       borderBottom: "1px solid #e0e0e0",
//                       marginBottom: "1.5rem"
//                     }}>
//                       <MDBRow>
//                         <MDBCol md="3">
//                           <MDBView hover rounded className="z-depth-1-half mb-4">
//                             <img
//                               className="img-fluid"
//                               src="https://mdbootstrap.com/img/Photos/Horizontal/Food/4-col/img%20(45).jpg"
//                               alt=""
//                             />
//                             <a href="#!">
//                               <MDBMask overlay="white-slight" className="waves-light" />
//                             </a>
//                           </MDBView>
//                         </MDBCol>
//                         <MDBCol md="9">
//                           <p className="font-weight-bold dark-grey-text">
//                             25/02/2018
//                           </p>
//                           <div className="d-flex justify-content-between">
//                             <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                               <a href="#!" className="dark-grey-text">
//                                 Itaque earum rerum hic tenetur a sapiente delectus
//                               </a>
//                             </MDBCol>
//                             <a href="#!">
//                               <MDBIcon icon="angle-double-right" />
//                             </a>
//                           </div>
//                         </MDBCol>
//                       </MDBRow>
//                     </div>
      
//                     <div style={{
//                           borderBottom: "1px solid #e0e0e0",
//                           marginBottom: "1.5rem"
//                         }}>
//                       <MDBRow>
//                         <MDBCol md="3">
//                           <MDBView hover rounded className="z-depth-1-half mb-4">
//                             <img
//                               className="img-fluid"
//                               src="https://mdbootstrap.com/img/Photos/Others/images/87.jpg"
//                               alt=""
//                             />
//                             <a href="#!">
//                               <MDBMask overlay="white-slight" className="waves-light" />
//                             </a>
//                           </MDBView>
//                         </MDBCol>
//                         <MDBCol md="9">
//                           <p className="font-weight-bold dark-grey-text">
//                             24/03/2018
//                           </p>
//                           <div className="d-flex justify-content-between">
//                             <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                               <a href="#!" className="dark-grey-text">
//                                 Soluta nobis est eligendi optio cumque nihil impedit
//                                 quo minus
//                               </a>
//                             </MDBCol>
//                             <a href="#!">
//                               <MDBIcon icon="angle-double-right" />
//                             </a>
//                           </div>
//                         </MDBCol>
//                       </MDBRow>
//                     </div>
      
//                     <div className="mb-4">
//                       <MDBRow>
//                         <MDBCol md="3">
//                           <MDBView hover rounded className="z-depth-1-half mb-4">
//                             <img
//                               className="img-fluid"
//                               src="https://mdbootstrap.com/img/Photos/Others/img%20(27).jpg"
//                               alt=""
//                             />
//                             <a href="#!">
//                               <MDBMask overlay="white-slight" className="waves-light" />
//                             </a>
//                           </MDBView>
//                         </MDBCol>
//                         <MDBCol md="9">
//                           <p className="font-weight-bold dark-grey-text">
//                             23/02/2018
//                           </p>
//                           <div className="d-flex justify-content-between">
//                             <MDBCol size="11" className="text-truncate pl-0 mb-3">
//                               <a href="#!" className="dark-grey-text">
//                                 Duis aute irure dolor in reprehenderit in voluptate
//                               </a>
//                             </MDBCol>
//                             <a href="#!">
//                               <MDBIcon icon="angle-double-right" />
//                             </a>
//                           </div>
//                         </MDBCol>
//                       </MDBRow>
//                     </div>
//                   </MDBCol>
//                 </MDBRow>
//               </MDBCardBody>
//             </MDBCard>
//         );
//       }
//       }
      
//       export default ProfilPage;