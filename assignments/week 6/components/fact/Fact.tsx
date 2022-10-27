import React from "react";

interface IFactProps{
    id: number,
    fact: string,
    isTrue: bool
}

class Fact extends React.Component<IFactProps> {

    render() {
        return (
            <tr className={this.props.isTrue}>
                <th>{this.props.id}</th>
                <td>{this.props.fact}</td>
            </tr>
        );
    }
}

export default Fact;