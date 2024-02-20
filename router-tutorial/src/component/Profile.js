import React from 'react';
import { useParams ,useLocation, useSearchParams } from 'react-router-dom';

const data={
    haley :{
        name: 'haley',
        description : 'computer engineering bachelor degree student',
    },
    emiley : {
        name : 'emily',
        description : 'a mom who teaches computer language',
    }
}

const Profile =()=> {
    const location = useLocation();
    const {username} = useParams();
    const profile = data[username];
    const [searchParams, setSearchParams] = useSearchParams();
    const keywords = searchParams;
    const keyword = keywords.get("search");
    if(!profile){
        return <div>존재하지 않는 사용자 입니다.</div>
    }
    return (
        <div>
            <h3>{username}({profile.name})</h3>
            <p>{profile.description}</p>
            <ul>
                <li>keywords : {keywords}</li>
                <li>keyword : {keyword}</li>
                <br/>
                <li>hash : {location.hash}</li>
                <li>pathname : {location.pathname}</li>
                <li>search : {location.search}</li>
                <li>state : {location.state}</li>
                <li>key : {location.key}</li>
            </ul>
            
        </div>
    );
}

export default Profile;