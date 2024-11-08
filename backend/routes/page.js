const express = require('express');

const rout = express.Router();

rout.use(express.json())


rout.get('/', (req, res) => {
  // res.send('Successfull response.');
  res.status(200).send([{
    id: "1",
    title: "Pumpkin Muffins with Maple Cream Cheese Filling",
    date:"25/1/2025",
    content: "Pumpkin muffins are getting a lightly crunchy, sparkly cinnamon sugar topping, and then stuffed to the brim with maple cream cheese whipped cream. YUM.HOLY. SMOKES. Pumpkin muffins are getting a lightly crunchy, sparkly cinnamon sugar topping, and then stuffed to the brim with maple cream cheese whipped cream. They are pure joy.Part muffin, part cupcake, and part cream puff _ in other words, a match made in heaven.",
    cate: "posted"
  },
  {
    id: "2",
    title: "Miracle No Knead Bread",
    date:"11/7/2024",
    content: "Miracle No Knead Bread! this is SO UNBELIEVABLY GOOD and ridiculously easy to make. crusty outside, soft and chewy inside – perfect for dunking in soups!Let me paint a picture for you. It starts with a golden and ragged-looking crusty loaf of piping hot white bread being roughly torn into chunks, steam escaping, crumbs flying everywhere across the table, and it ends with that swift swooping motion as its hot n’ chewy little self dives deep into the bowl of thick soup and delivers a bit of chewy carbs sopped with flavor to your hungry, happy mouth. Honestly. The pure bliss of this moment.Welcome to fall, bread lovers.I have some really good news for you today.",
    cate: "posted"
    },
  {
    id: "3",
    title: "When Would You Prefer a Decision Tree?",
    date:"8/12/2024",
    content: "Under what circumstances might you prefer the Decision Tree to the Random Forest, even though the Random Forest generally gives more accurate predictions?This is a discussion thread to follow up on the Machine Learning course",
    cate: "posted"
    },
  {
    id: "4",
    title: "What is Artificial Intelligence (AI)?",
    date:"11/11/2023",
    content: "Artificial intelligence (AI) is a set of technologies that enable computers to perform a variety of advanced functions, including the ability to see, understand and translate spoken and written language, analyze data, make recommendations, and more.AI is the backbone of innovation in modern computing, unlocking value for individuals and businesses. For example, optical character recognition (OCR) uses AI to extract text and data from images and documents, turns unstructured content into business-ready structured data, and unlocks valuable insights.Ready to get started?",
    cate: "posted"
    },
  ])
});

module.exports = rout