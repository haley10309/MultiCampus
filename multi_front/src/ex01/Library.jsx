import React from "react";
import Book from "./Book";


function Library(props){
    return(
        <div >
            <Book name = "코딩 좀 하는 사람" numOfPage={314}></Book>
            <Book name = "java 언어로 배우는 디자인 패턴 입문" numOfPage={34}></Book>
            <Book name = "계속 가봅시다 남은 게 체력인데" numOfPage={500}></Book>
        </div>
    );
}
export default Library;