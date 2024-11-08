const express = require('express');
const { head } = require('./comment');

const rout = express.Router();

rout.use(express.json())


rout.get('/', (req, res) => {
  // res.send('Successfull response.');
  res.status(200).send([{
    id: "1",
    title: "WordPress Introduction",
    date:"8/11/2024",
    content: "The WordPress software is a powerful CMS (content management system) used for building websites. There are many wonderful aspects to WordPress and high among them are its flexibility and extensibility. Its secret? WordPress is open source software. This means it has a large community constantly contributing to its development and creating tools which provide additional functionality to its users. If you want to learn more about the WordPress open source project, the About WordPress.org page  is a good place to start. ",
    cate: "posted"
  },
  {
    id: "2",
    title: "How Did AlphaGo Beat Lee Sedol?",
    date:"7/11/2024",
    content: "Watching AlphaGo face Lee Sedol in 2016 was unforgettable. There was an AI program taking on one of the greatest Go players in history — and winning. If you haven’t seen AlphaGo — The Movie yet, stop reading and watch it. Seriously. I’ll wait.",
    cate: "posted"
  },
  {
    id: "3",
    title: "An Introduction to Transformers in Machine Learning (Part 1)",
    date:"6/11/2024",
    content: "When you read about Machine Learning in Natural Language Processing these days, all you hear is one thing — Transformers. Models based on this Deep Learning architecture have taken the NLP world by storm since 2017. In fact, they are the go-to approach today, and many of the approaches build on top of the original Transformer, one way or another.",
    cate: "posted"
   },

  {
    id:"4",
    title:"Why More People are Growing Their Own Food",
    date:"8/11/2024",
    content:"My early interest in gardening had more to do with mules than with food. In early spring, my parents transformed their small parcel of land into a lush garden, where corn, butter beans, tomatoes, squash, and cabbage vied for space beneath a southern summer sun.",
    cate:"draft"
   },
   {
    id:"5",
    title:"Curd-Rice — How a South Indian Defines Comfort Food",
    date:"5/11/2024",
    content:"Thayir saadam (Tamil), thayir choru (Malayalam), mosaranna (Kannada), perugannam (Telugu) each translate to “yogurt rice.” And yet this dish is a bona-fide comfort food in this tropical region of India. Because in its simplicity lies its deliciousness.",
    cate:"draft"
   },
   {
    id:"6",
    title:"How Did AlphaGo Beat Lee Sedol?",
    date:"3/11/2024",
    content:"Watching AlphaGo face Lee Sedol in 2016 was unforgettable. There was an AI program taking on one of the greatest Go players in history — and winning. If you haven’t seen AlphaGo — The Movie yet, stop reading and watch it. Seriously. I’ll wait.",
    cate:"draft"
   },

   {
    id:"7",
    title:"My 7 Sources of Income as a Data Scientist",
    date:"9/11/2024",
    content:"Being a data scientist gives you many opportunities to generate multiple streams of income. In this article, I want to break down my 7 sources to hopefully give you some ideas that you can try yourself.",
    cate: "schedule"
   },
   {
    id:"8",
    title:"10 Python Functions Every Data Scientist Must Memorize",
    date:"10/11/2024",
    content:"It’s tempting to turn to Google and ChatGPT every time you need a python function. Toggling back and forth, however, is time-consuming and energy-draining. According to professors Meyer, Evans, and Rubinstein each “task switch” can lead to a 40% loss in productivity. After experiencing too much brain drain from toggling, I decided to memorize these ten Python functions, and my programming abilities soared.",
    cate: "schedule"
   },
   {
    id:"9",
    title:"AdventureGPT: Using LLM-Backed Agents to Play Text-Based Adventure Games",
    date:"11/11/2024",
    content:"Recently, I decided to take some time to learn how to utilize ChatGPT and other OpenAI models. Like much of the world, I had played with OpenAI’s chat interface and had some interesting and silly conversations with ChatGPT. However, I wanted to dig deeper and really understand the development tools available.",
    cate: "schedule"
   },
   {
    id:"10",
    title:"Top 15 DePIN Crypto Projects for November 2024",
    date:"8/11/2024",
    content:"I cover the Crypto space and Beta test the latest DePIN projects for you! Let’s maximize our passive income and Crypto investments together. Before we start, please clap and follow to be first for the next 100X!",
    cate:"trash"
   },
   {
    id:"11",
    title:"My 7 Sources of Income as a Data Scientist",
    date:"9/11/2024",
    content:"Being a data scientist gives you many opportunities to generate multiple streams of income. In this article, I want to break down my 7 sources to hopefully give you some ideas that you can try yourself.",
    cate:"trash"
   },
   {
    id:"12",
    title:"10 Python Functions Every Data Scientist Must Memorize",
    date:"",
    content:"It’s tempting to turn to Google and ChatGPT every time you need a python function. Toggling back and forth, however, is time-consuming and energy-draining. According to professors Meyer, Evans, and Rubinstein each “task switch” can lead to a 40% loss in productivity. After experiencing too much brain drain from toggling, I decided to memorize these ten Python functions, and my programming abilities soared.",
    cate:"trash"
   },

  ])
});

module.exports = rout