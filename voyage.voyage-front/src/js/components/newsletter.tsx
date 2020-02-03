import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon } from "mdbreact";


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
          
          
   
      this.state.nameSubscriber = document.getElementById('name').value;
      this.state.emailSubscriber = document.getElementById('email').value;


        alert('Vous recevrez notre newsletter ' + this.state.nameSubscriber + ', à cette adresse email : ' + this.state.emailSubscriber );

       

        const url ="http://localhost:8282/api/newsletter/add";


        const headers = new Headers({
          // "Accept": "application/json",
        "Content-Type": "application/json"});

 
        fetch(url, { 

            method: "POST", // ou 'PUT'

            // headers:{ "Content-Type": "application/json"},
            headers,
            // mode: "no-cors", 
            body: JSON.stringify( { 
              // {obj}
              // {toto}
              nameSubscriber: this.state.nameSubscriber,
              emailSubscriber: this.state.emailSubscriber
            } ),
            mode: "cors"
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