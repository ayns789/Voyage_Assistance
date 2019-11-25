import * as React from 'react';
import Prez from "../components/homePrez";
import Redire from "../components/homeRedirections";
import Sub from "../components/newsletter";
// import "../../less/components/main.less";


class Home extends React.Component {
  render() {

    return(
      <div>
      <Prez />

      <Redire />

      <Sub />
      </div>
   
    )
  }
}


export default Home;
