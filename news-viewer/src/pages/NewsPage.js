import React from 'react';
import NewsList from '../components/NewsList';
import { useParams } from 'react-router-dom';
import Categories from '../components/Categories';

const NewsPage = () => {
    const category = useParams().category || 'all';

    return (
        <>
        <Categories/>
        <NewsList category={category}/>
        </>
    );
}

export default NewsPage;