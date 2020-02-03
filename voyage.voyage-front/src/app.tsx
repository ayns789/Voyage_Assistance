import * as React from "react";

// Router
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

//Pages
import Login from "./js/pages/login";
import Home from "./js/pages/home";
import ContactPage from "./js/pages/contact";
import Sejour from "./js/pages/sejours";
import Activity from "./js/pages/activites";
import Service from "./js/pages/services";
import Registery from "./js/pages/register";
import Profil from "./js/pages/profil";
import Logout from "./js/pages/logout";
// import UserRegisterComponent from "./js/pages/register";

//Components
import Header from "./js/components/header";
import Navbar from "./js/components/navbar";
import ScrollToTop from "./js/components/scrollTop"; 
import Footer from "./js/components/footer";

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
        <ScrollToTop />
        <Navbar />
        <Header />
        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}

        <main className="main-wrapper">
          <Switch>
            <Route path="/login">
              <Login isLoaded={false} />
            </Route>
            <Route path="/creer-compte">
              <Registery />
              {/* <UserRegisterComponent /> */}
            </Route>
            <Route path="/contact">
              <ContactPage />
            </Route>
            <Route path="/sejours">
              <Sejour />
            </Route>
            <Route path="/services">
              <Service />
            </Route>
            <Route path="/activites">
              <Activity />
            </Route>
            <Route path="/profil">
              <Profil />
            </Route>
            <Route path="/logout">
              <Logout />
            </Route>
            {/* <Link to="/activites" */}
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
