import * as React from "react";

import { Redirect } from "react-router-dom";
// import { Container, Col, Form,
//   FormGroup, Label, Input,
//   Button } from 'reactstrap';
import "../../less/components/login.less";
import {
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBCard,
  MDBCardBody,
  MDBModalFooter,
  MDBIcon,
  MDBCardHeader,
  MDBBtn,
  MDBInput
} from "mdbreact";


//Typescript
interface Props {
  title: string;
}

//Typescript
interface State {
  email: string;
  password: string;
  user: object;
  userIsDefined: boolean;
}

class Login extends React.Component<Props, State> {
  state: { email: string; password: string; user: {}; userIsDefined: boolean; };
  constructor(props) {
    super(props);

    this.state = {
      email: "email@test.com",
      password: "derpderp",
      user: {},
      userIsDefined: false
    };

    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentDidMount() {
    // window.localStorage.clear();
  }

  handleSubmit(event) {
    event.preventDefault();

    fetch("https://jsonplaceholder.typicode.com/users", {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    }).then(data => {
      data.json().then(results => {
        this.setState({
          user: results[0],
          userIsDefined: true
        });

        window.localStorage.setItem("user", results[0]);
      });
    });
  }
  setState(arg0: { user: any; userIsDefined: boolean; }) {
    throw new Error("Method not implemented.");
  }

  render() {
    if (this.state.userIsDefined) {
      return (
        <Redirect
          to={{
            pathname: "/"
          }}
        />
      );
    }

    return (
      // <React.Fragment>
      //   <h1>{this.props.title}</h1>
      //   <form onSubmit={this.handleSubmit}>
      //     <label><font color="white">email :</font></label>
      //     <input name="email" />
      //     <label><font color="white">Password :</font></label>
      //     <input name="password" />
      //     <button>Se connecter</button>
      //   </form>
      // </React.Fragment>

      <React.Fragment>
        {/* <section className="my-5 mr-5 ml-5">
      <Container className="Login">
        <h2>Connectez vous</h2>
        <Form className="form">
        <div id="text">
          <Col>
            <FormGroup>
              <Label>Email</Label>
              <Input
                type="email"
                name="email"
                id="exampleEmail"
                placeholder="myemail@email.com"
              />
            </FormGroup>
          </Col>
          <Col>
            <FormGroup>
              <Label for="examplePassword">Password</Label>
              <Input
                type="password"
                name="password"
                id="examplePassword"
                placeholder="********"
              />
            </FormGroup>
          </Col>
          </div>
          <Button>Submit</Button>
        </Form>
      </Container>
      </section> */}
      <section className="my-5">
    <MDBContainer className="Login">
      <MDBRow>
        <MDBCol md="12">
          <MDBCard>
            <MDBCardBody>
              <MDBCardHeader className="form-header deep-blue-gradient rounded">
                <h3 className="my-3">
                  <MDBIcon icon="lock" /> Login:
                </h3>
              </MDBCardHeader>
              <form>
                <div className="grey-text">
                  <MDBInput
                    label="Type your email"
                    icon="envelope"
                    group
                    type="email"
                    validate
                    error="wrong"
                    success="right"
                  />
                  <MDBInput
                    label="Type your password"
                    icon="lock"
                    group
                    type="password"
                    validate
                  />
                </div>

              <div className="text-center mt-4">
                <MDBBtn
                  color="light-blue"
                  className="mb-3"
                  type="submit"
                >
                  Login
                </MDBBtn>
              </div>
              </form>
              <MDBModalFooter>
                <div className="font-weight-light">
                  <p>Not a member? Sign Up</p>
                  <p>Forgot Password?</p>
                </div>
              </MDBModalFooter>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
    </section>
  );
};
      </React.Fragment>

      


    );
  }
}

export default Login;
