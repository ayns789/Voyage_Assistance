import * as React from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

//Pages
import Login from "./js/pages/login";
import Home from "./js/pages/home";
import ContactPage from "./js/pages/contact";
import Footer from "./js/components/footer";
import Sejour from "./js/pages/sejours";

//Components
import Header from "./js/components/header";
import Navbar from "./js/components/navbar";

// reactstrap :
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap/dist/css/bootstrap.min.css";

class App extends React.Component {
  componentDidMount() {
    let userFromStorage = window.localStorage.getItem("user");
    console.log("user from local storage", userFromStorage);

    window.localStorage.clear();
  }

  render() {
    return (
      <Router>
        <Navbar />
        <Header />
        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}

        <main className="main-wrapper">
          <Switch>
            <Route path="/login">
              <Login isLoaded={false} />
            </Route>
            <Route path="/contact">
              <ContactPage />
            </Route>
            <Route path="/sejours">
              <Sejour />
            </Route>
            <Route path="/">
              <Home />
            </Route>
          </Switch>
        </main>
        {/* <React.Fragment>
        <Switch>
          <Route path="/login" component={ Login title="My super login page" isLoaded={false}} />
          <Route path="/" component={ Home } />
        </Switch>
      </React.Fragment> */}
      <Footer />
      </Router>
    );
  }
}

// L'export par défault de notre fichier app.tsx est la class App qui a été extends par React
// Mon app peut être désormais importé dans d'autres fichiers de mon projet
export default App;
