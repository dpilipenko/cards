package cards

class Card {
  static belongsTo = [deck: Deck]

  String content
  Boolean isDeleted
  Date dateUpdated
}
