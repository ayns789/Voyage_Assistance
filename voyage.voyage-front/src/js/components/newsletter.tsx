import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon } from "mdbreact";

// //Typescript
// interface Props {
//   title: string;
// }

// //Typescript
// interface State {
//   name: string;
//   email: string;
// }

// class subscribeNews extends React.Component<Props, State> {
  class subscribeNews extends React.Component {
  constructor() {
    super();

    this.state = {
      nameSubscriber:"", 
      emailSubscriber:""
    }
  }

  handleChange = event =>{
    this.setState({ [event.target.nameSubscriber]:event.target.value })
    }

    handleSubmit = event =>{
    event.preventDefault();
    const url ="http://localhost:8080/newsletter/add";

    const data = { nameSubscriber:this.state.nameSubscriber, emailSubscriber:this.state.emailSubscriber };

    fetch(url, { method: "POST", // or ‘PUT’

    body: JSON.stringify(data), // data can be `string` or {object}!

    headers:{ "Content-Type": "application/json" } })
    .then(res => res.json())
    .catch(error => console.error("Error:", error))
    .then(response => console.log("Success:", response)); 
  }

  render(){
  return (

    <div>
    <MDBContainer>
      <MDBRow>
        <MDBCol md="12">
          <form>
            <h2 className="h2-responsive font-weight-bold text-center my-3 deep-purple-text text-monospace text-uppercase z-depth-1 cloudy-knoxville-gradient rounded mb-0">Reçevez notre newsletter, avec les dernières offres de séjours</h2>
            <label
              htmlFor="defaultFormCardNameEx"
              className="dark-text font-weight-light text-monospace lead"
            >
              Votre prénom
            </label>
            <input
              type="text"
              name="nameSubscriber"
              id="defaultFormCardNameEx"
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
              name="emailSubscriber"
              id="defaultFormCardEmailEx"
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
  );
};
}


export default subscribeNews;