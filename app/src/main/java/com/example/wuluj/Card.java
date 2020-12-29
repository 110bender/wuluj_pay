package com.example.wuluj;

public class Card   {
        private int cardImg;
        private String cardTitle;
        private int cardImgProfile;
        private String cardName;

        public Card(int cardImg, String cardTitle, int cardImgProfile, String cardName) {
            this.cardImg = cardImg;
            this.cardTitle = cardTitle;
            this.cardImgProfile = cardImgProfile;
            this.cardName = cardName;
        }

        public void changeTxt1 (String txt){
            cardTitle = txt;
        }
        public int getCardImg() {
            return cardImg;
        }
        public String getCardTitle() {
            return cardTitle;
        }
        public int getCardImgProfile() {return cardImgProfile;}
        public String getCardName() {
            return cardName;
        }
}