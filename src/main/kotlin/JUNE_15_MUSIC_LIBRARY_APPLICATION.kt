/*
"You are building a music library application in Kotlin. The application should have the following features:

Create a class called Song with properties like title, artist, and duration. Implement a method called play()
 that prints ""Now playing: [title] by [artist]"" along with the duration of the song in seconds.

Write a higher-order function called filterByArtist that takes a list of Song objects and an artist name as input.

The function should filter the songs based on the artist's name and return a new list. Use a lambda expression to perform the filtering.

Create a mutable list of Song objects and populate it with a few songs. Use the filterByArtist function to filter the songs by a specific artist.
Print the filtered list of songs.

Implement a class called Playlist that has property songs as a list of Song objects. The Playlist class should have a method called addSong that takes a
Song object as input and adds it to the songs list.

Use exception handling to handle the scenario where a duplicate song is added to the playlist. If a duplicate song is detected,
throw a custom exception called DuplicateSongException with an appropriate error message."
 */

class Song(var title: String, var artist: String, var duration: Double) {

    fun play() {
        println("Now playing: [$title] by [$artist] with Duration : [$duration] seconds")
    }

    override fun toString(): String {
        return "Song(title='$title', artist='$artist', duration=$duration)"
    }
}


fun filterByArtist(songsList: List<Song>, artistName: String): List<Song> {
    return songsList.filter { it.artist == artistName }
}

class DuplicateSongException(message: String) : Exception(message)

class Playlist {
    var songs = mutableListOf<Song>()

    fun addSong(song: Song) {
        if (songs.any { it.title == song.title && it.artist == song.artist }) {
            throw DuplicateSongException("Duplicate song: ${song.title} by ${song.artist}")
        } else {
            songs.add(song)
            println("Song added: ${song.title} by ${song.artist}")
        }
    }
}

fun main() {

    var songsList = mutableListOf<Song>()
    var song1 = Song("Vachinde", " Fidaa", 4.0)
    songsList.add(song1)
    var song2 = Song("Inkem Inkem Inkem Kaavaale", "Geetha Govindam", 5.15)
    songsList.add(song2)
    var song3 = Song("Butta Bomma", "Ala Vaikunthapurramuloo", 3.52)
    songsList.add(song3)
    var song4 = Song("Ramuloo Ramulaa", "Ala Vaikunthapurramuloo", 4.05)
    songsList.add(song4)
    var song5 = Song("Samajavaragamana", "Ala Vaikunthapurramuloo", 4.25)
    songsList.add(song5)
    song1.play()
    println("Enter the artist name")
    var artistName = readln()
    println(filterByArtist(songsList, artistName))
    try {
        var playlist = Playlist()
        playlist.songs = songsList
        playlist.addSong(Song("Song 1", "Artist 1", 180.0))
        playlist.addSong(Song("Song 2", "Artist 2", 240.0))
        playlist.addSong(Song("Song 3", "Artist 1", 200.0))
        playlist.addSong(Song("Song 4", "Artist 3", 300.0))
        playlist.addSong(Song("Samajavaragamana", "Ala Vaikunthapurramuloo", 4.25))
    } catch (e: DuplicateSongException) {
        println(e.message)
    }
}