import React from 'react';

function MyComponent(props) {
    return (
        <div>
            안녕하세요 저의 인름은 {props.name}입니다.<br/>
            저의 나이는 {props.age}입니다.
        </div>
    );
}

export default MyComponent;