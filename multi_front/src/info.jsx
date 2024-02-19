import React ,{useEffect, useState , useReducer } from 'react';



function reducer (state, action ){
    return{
        ...state,
        [action.name] : action.value
    }
}
const Info =()=>{
    // const [name, setName] = useState('');
    // const [nickname, setNickname] = useState('');
    
    const [state,dispatch] = useReducer(reducer, {name:'', nickname:''});
    const { name, nickname } = state;

    const onChange = e =>{
        dispatch(e.target);
    };
    // useEffect(()=>{
    //     console.log("effect");
    //     console.log({name,nickname});
    //     return () =>{
    //         console.log("cleanUp");
    //         console.log(name);

    //     }
    // },[name]);//최초 마운트 되었을 때만 실행 
    // const onChangeName = e =>{
    //     setName(e.target.value);
    // }
    // const onChangeNickname = e =>{
    //     setNickname(e.target.value);
    // }

    return (
        <div>
            <div>
                <input name ="name" value={name} onChange={onChange}/>
                <input name ="nickname" value={nickname} onChange={onChange}/>
            </div>
            <div>
                <div>
                    <b>이름 : </b>{name}
                </div>
                <div>
                    <b>닉네임 : </b>{nickname}
                </div>
            </div>
            
        </div>
    );
}

export default Info;