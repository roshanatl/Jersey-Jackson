package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Track;

@Path("/json/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}
	@GET
	@Path("/getTracks")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTracksInJSON() {
		List<Track> tracks = new ArrayList<Track>();
				
		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
		tracks.add(track);

		Track track1 = new Track();
		track1.setTitle("Enter Sandman1");
		track1.setSinger("Metallica1");
		tracks.add(track1);
		return tracks;
		
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}