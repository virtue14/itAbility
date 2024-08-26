import {createRouter, createWebHistory} from 'vue-router';

import Login from "../src/components/login/Login.vue";
import FeedDetail from '../src/components/Feed/FeedDetail.vue';
import MyPageMain from "../src/components/mypage/MyPageMain.vue";
import FeedList from "../src/components/Feed/FeedList.vue";
import FeedCreate from "../src/components/Feed/FeedCreate.vue";
import RecruitPage from "../src/components/recruit/RecruitPage.vue";
import Jobs from "../src/components/jobs/jobs.vue";
import RecruitDetailPage from '../src/components/recruit/RecruitDetailPage.vue';
import RecruitRegistPage from '../src/components/recruit/RecruitRegistPage.vue';

const routes = [
    {path: '/login', component: Login},
    {
        path: '/feeds/:boardId', // 동적 세그먼트를 사용하여 피드 boardId를 경로에 포함
        name: 'FeedDetail',
        component: FeedDetail,
    },
    {
        path: '/feeds',
        component: FeedList
    },
    {
        path: '/create',
        name: 'FeedCreate',
        component: FeedCreate
    },
    {
        path: '/login',
        component: Login
    },
    {
        path: '/mypage',
        component: MyPageMain
    },
    {
        path: '/',
        component: FeedList
    },

    {
        path: '/recruit',
        component: RecruitPage
    },
    {
        path: '/jobs',
        component: Jobs
    },
    {
        path: '/recruit/:recruitId',
        component: RecruitDetailPage
    },
    {
        path: '/recruit/regist',
        component: RecruitRegistPage
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router;
