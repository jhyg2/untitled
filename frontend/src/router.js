
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AManager from "./components/listers/ACards"
import ADetail from "./components/listers/ADetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/as',
                name: 'AManager',
                component: AManager
            },
            {
                path: '/as/:id',
                name: 'ADetail',
                component: ADetail
            },



    ]
})
