import Fact from '../fact/Fact';
import './TTAAL.css';

interface IPropsTTAAL{

}

function TTAAL(props: IPropsTTAAL) {

    const facts = [
        {
            id: 1,
            fact: 'I have driven an Armored Personnel Carrier, sailed a boat, and flown a plane.',
            isTrue: true
        },
        {
            id: 2,
            fact: 'My daily driver is a 1985 Chevy Camaro.',
            isTrue: true
        },
        {
             id: 3,
             fact: 'My favorite color is yellow.',
             isTrue: false
        }
    ]

    return (
        <main>
            <h3>Two truth and a lie:</h3>
            <table>
                {/* <Fact id={facts[0].id} fact={facts[0].fact} isTrue={facts[0].isTrue}  />
                <Fact id={facts[1].id} fact={facts[1].fact} isTrue={facts[1].isTrue}/>
                <Fact id={facts[2].id} fact={facts[2].fact} isTrue={facts[2].isTrue}/> */}
                {
                    facts.map( fact => {
                        return <Fact id={fact.id} fact={fact.fact} isTrue={fact.isTrue}  />})
                }
            </table>
        </main>
    );
}

export default TTAAL;