package cards

class Card {
  static belongsTo = [deck: Deck]

  String content
  Date dateUpdated
}
