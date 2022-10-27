import './Nav.css';
import { Link } from 'react-router-dom';

function Nav() {
    return (
        <nav>
            <ul>
                <li><Link to="">Home</Link></li>
                <li><Link to="ttaal">TTAAL</Link></li>
                <li><a href="http://www.google.com">Questions?</a></li>
            </ul>
        </nav>
    );
}

export default Nav;