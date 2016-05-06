package cards

class Deck {
  static belongsTo = [owner: Profile]
  static hasMany = [cards: Card]

  String title
  Date dateUpdated
}
