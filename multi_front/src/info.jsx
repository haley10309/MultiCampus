import React ,{useEffect, useState} from 'react';

function Info (props){
    const [name, setName] = useState('');
    const [nickname, setNickname] = useState('');
    useEffect(()=>{
        console.log("effect");
        console.log({name,nickname});
        return () =>{
            console.log("cleanUp");
            console.log(name);

        }
    },[name]);//최초 마운트 되었을 때만 실행 
    const onChangeName = e =>{
        setName(e.target.value);
    }
    const onChangeNickname = e =>{
        setNickname(e.target.value);
    }

    return (
        <div>
            <div>
                <input name ="name" value={name} onChange={onChangeName}></input>
                <input name ="Nickname" value={nickname} onChange={onChangeNickname}></input>
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