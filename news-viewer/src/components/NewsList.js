import React from "react";
import styled from "styled-components";
import NewsItem from "./NewsItem";
import axios from "axios";
import usePromise from "../lib/usePromise";

const NewsListBlock = styled.div`
  box-sizing: border-box;
  padding-bottom: 3rem;
  width: 768px;
  margin: 0 auto;
  margin-top: 2rem;
  @media screen and (max-width: 768px) {
    width: 100%;
    padding-left: 1rem;
    padding-right: 1rem;
  }
`;
const NewsList = ({category}) => {
  const [loading, response, error] = usePromise(() => {
    const query = category === 'all' ? '' : `&category=${category}`;
    return axios.get(
      `https://newsapi.org/v2/top-headlines?country=kr${query}&apiKey=775b7af09e2849789068b69a9c2613eb`,
//하루에 100번 밖에 사용 못함.
    );
  },[category]);
  //로딩중
  if (loading) {
    return <NewsListBlock>대기중...</NewsListBlock>;
  }
  //response 설정 안되었을 때
  if (!response) {
    return <NewsListBlock>데이터를 불러오는 중...</NewsListBlock>;
  }
  if (error) {
    return <NewsListBlock>에러발생!</NewsListBlock>;
  }
  //response 값이 유효하면
  const { articles } = response.data;
  return (
    <NewsListBlock>
      {articles.map((article) => (
        <NewsItem key={article.url} article={article} />
      ))}
    </NewsListBlock>
  );
};

export default NewsList;
