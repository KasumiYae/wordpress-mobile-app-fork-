const express = require('express');

const rout = express.Router();

rout.use(express.json())


rout.get('/', (req, res) => {
  // res.send('Successfull response.');
  res.status(200).send([{
    id: "1",
    username: "John Culkin",
    date:"4 days ago",
    content: "Sweet, appreciate it! Secretly commenting to also increase my odds of winning the Crankk giveaway! 🤫",
    cate: "pending"
  },
  {
    id: "2",
    username: "RafalP",
    date:"3 days ago",
    content: "Hi! Thank you for sharing this notebook! It helped me to understand the Python implementation of simple tree-structured classification model. 🙏",
    cate: "pending"
  },
  {
    id: "3",
    username: "John Culkin",
    date:"4 days ago",
    content: "Very good notebook ,Useful and organized 👍👍👍",
    cate: "pending"
  },
  
  {
    id: "4",
    username: "Easy Marketing Tips",
    date:"7 days ago",
    content: "Fascinating topic! Thanks for the detailed review of DePIN projects and discount codes. As someone interested in crypto investments, I will definitely use this information. I will follow the development of DePIN and look for new opportunities for passive income.",
    cate: "unanswered"
  },
  {
    id: "5",
    username: "Tejash Shah",
    date:"5 days ago",
    content: "Great Job!",
     cate: "unanswered"
  },
  {
    id: "6",
    username: "Никита Дмитриев",
    date:"4 days ago",
    content: "Look, you didn't predict (precision and recall are zero) 2 classes out of 4 existing ones. The tree is only slightly better than simply choosing 'unacc' class. At the same time, when analyzing the results,",
    cate: "unanswered"
  },


  {
      id: "7",
      username: "Cryptocurrency blog",
      date:"3 month ago",
      content: "I learned so much from this article. Thank you for the effort!",
      cate: "replied"
  },
  {
    id: "8",
    username: "Karan_SR",
    date:"7 days ago",
    content: "I learned so much from this article. Thank you for the effort!",
    cate: "replied"
  },
  {
    id: "9",
    username: "Digvijay Patelg",
    date:"1 days ago",
    content: "I learned so much from this article. Thank you for the effort!",
    cate: "replied"
  },


    {
      id: "10",
      username: "Adebajo Adeseye Deji",
      date:"6 days ago",
      content: "What do you think of the new peoject called Open GPU",
      cate: "approved"
    },
    {
      id: "11",
      username: "AlexL98",
      date:"5 days ago",
      content: "I read through the entire tutorial and made some modifications to the data (which I'll explain later). Then, I attempted Decision Tree with factor analysis. I achieved a result of 93% accuracy score.",
      cate: "approved"
    },
    {
      id: "12",
      username: "Ali Özgür Dede",
      date:"2 days ago",
      content: "Hi, thanks for this comprehensive notebook",
      cate: "approved"
    },

    {
      id: "13",
      username: "Jordan Belli",
      date:"10 days ago",
      content: "Thanks, ordered a GEODNET Station miner with the discount code ' BestDiscountCode '. Saved me some money!",
      cate: "spam"
    },
    {
      id: "14",
      username: "Drewry",
      date:"7 days ago",
      content: "Happy Thursday everyone. From the looks of things, these pumpkin muffins with maple cream cheese filling are an absolute game changer. Some people might be a bit skeptical about the maple and pumpkin combo. But once they open their minds up and experience the goodness, they’re guaranteed to come running back for more.",
      cate: "spam"
    },
    {
      id: "15",
      username: "Juli Pelletier",
      date:"6 days ago",
      content: "I want these solely because the teeth marks in the maple cream cheese in the photo! 😂",
      cate: "spam"
    },

    {
      id: "16",
      username: "John Morren",
      date:"15 days ago",
      content: "Ik droom dat ik een toer do haar in de wind en gezellig van Antwerpen naar Frankrijk Spanje en zo verder",
      cate: "bin"
    },
    {
      id: "17",
      username: "Lori Betts",
      date:"11 days ago",
      content: "Didn’t have time to make the muffins, so I made just the filling and spread it on Trader Joe’s Pumpkin Brioche. Delicious!!!",
      cate: "bin"
    },
    {
      id: "18",
      username: "Britt",
      date:"7 days ago",
      content: "Made these as directed and they are fantastic. The spicing is not overwhelming but I would not describe them as bland. It allows for the pumpkin, maple and cream cheese flavors to shine rather than tasting too much of cinnamon or clove. Pumpkin bread is the only sweet iteration of pumpkin I like and this has taken it to the next level.",
      cate: "bin"
    }
    
  ])
});

module.exports = rout