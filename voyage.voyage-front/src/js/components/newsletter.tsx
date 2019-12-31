import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon } from "mdbreact";

// //Typescript
// interface Props {
  
// }

// // //Typescript
// interface State {
//   nameSubscriber: string;
//   emailSubscriber: string;
// //   user: object;
// //   userIsDefined: boolean;
// }

// class subscribeNews extends React.Component <Props, State>{
  class subscribeNews extends React.Component {
   
  constructor(props) {
    super(props);

    this.state = {
      nameSubscriber:"", 
      emailSubscriber:""
    };
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  // handleChange = event =>{
  //   this.setState({ [event.target.nameSubscriber]:event.target.value })
  //   }

  // document.getElementById('handleSubmit').addEventListener('submit', handleSubmit);

  // componentDidMount() {
  //   // window.localStorage.clear();
  // }


    handleSubmit = event =>{
          event.preventDefault();
          
          
      // const data = { nameSubscriber:this.state.nameSubscriber, emailSubscriber:this.state.emailSubscriber };
      // var vir = new Object(JSON.stringify(data));
      this.state.nameSubscriber = document.getElementById('name').value;
      this.state.emailSubscriber = document.getElementById('email').value;
      //  let toto = { name_subscriber:this.state.nameSubscriber, email_subscriber:this.state.emailSubscriber };
      // this.setState.nameSubscriber = nameSubscriber;
      // this.setState.emailSubscriber = emailSubsriber;
      

      // alert('Le nom a été soumis : ' + toto );
        alert('Le nom a été soumis : ' + this.state.nameSubscriber + ' email : ' + this.state.emailSubscriber );

        
        // alert('Le nom a été soumis : ' + document.getElementById('name').value = '';);
        // let emailSubscriber = document.getElementById('email').value = '';
        // const data = { nameSubscriber, emailSubscriber };

        const url ="http://localhost:8080/newsletter/add";

        // const data = { nameSubscriber: this.state.nameSubscriber, emailSubscriber: this.state.emailSubscriber };

        // const headers = new Headers({ "Content-Type": "application/json"});
        const headers = new Headers({
          "Accept": "application/json",
        "Content-Type": "application/json"});

        // let obj = {
        //   name_subscriber: this.state.nameSubscriber,
        //   email_subscriber: this.state.emailSubscriber
        // }
        // let obj = {
        //   nameSubscriber = document.getElementById('name').value;
        //   emailSubscriber = document.getElementById('email').value;
        // }


        // this.setState({
        //   name_subscriber: this.state.nameSubscriber,
        //   email_subscriber: this.state.emailSubscriber
        // });

        

        fetch(url, { 

            method: "POST", // ou 'PUT'

            // headers:{ "Content-Type": "application/json"},
            headers,
            // mode: "no-cors", 
            body: JSON.stringify( {
              // {obj}
              nameSubscriber: this.state.nameSubscriber,
              emailSubscriber: this.state.emailSubscriber
            } )
            // body : JSON.stringify(this.state.nameSubscriber, this.state.emailSubscriber)
        }).then(response => response.json())
        .then((data) =>  console.log(data))
        .catch((err)=>console.log(err));
      //   .then(response => {
      //     if (response.ok) {
      //         response.json()
      //             .then(console.log)
      //             .catch(error => {
      //                 console.error(error);
      //             });
      //     } else {
      //         console.error('server response : ' + response.status);
      //     }
      // }).catch(error => {
      //     console.error(error);
      // });
        
    
  }


  render(){
  return (

    <React.Fragment>
    <div>
    <MDBContainer>
      <MDBRow>
        <MDBCol md="12">
          <form onSubmit={this.handleSubmit}>
            <h2 className="h2-responsive font-weight-bold text-center my-3 deep-purple-text text-monospace text-uppercase z-depth-1 cloudy-knoxville-gradient rounded mb-0">Reçevez notre newsletter, avec les dernières offres de séjours</h2>
            <label
              htmlFor="defaultFormCardNameEx"
              className="dark-text font-weight-light text-monospace lead"
            >
              Votre prénom
            </label>
            <input
              type="text"
              name=""
              id="name"
              className="form-control"
            />
            <br />
            <label
              htmlFor="defaultFormCardEmailEx"
              className="dark-text font-weight-light text-monospace lead"
            >
              Votre email
            </label>
            <input
              type="email"
              name=""
              id="email"
              className="form-control"
            />
            <div className="text-center py-4 mt-3">
              <MDBBtn className="btn btn-outline-purple" type="submit">
                Envoyer
                <MDBIcon far icon="paper-plane" className="ml-2" />
              </MDBBtn>
            </div>
          </form>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
    </div>
    </React.Fragment>
  );
};
}


export default subscribeNews;