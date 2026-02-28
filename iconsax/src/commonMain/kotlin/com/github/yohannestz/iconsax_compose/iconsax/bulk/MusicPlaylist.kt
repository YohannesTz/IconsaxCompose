package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicPlaylist: ImageVector
    get() {
        val current = _musicPlaylist
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MusicPlaylist",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 5.25f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 3.75f, x2 = 6.0f, y2 = 3.75f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 18.41f, y1 = 5.25f, x2 = 18.0f, y2 = 5.25f)
                moveToRelative(dx = -3.0f, dy = -2.5f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 8.59f, y1 = 2.75f, x2 = 8.25f, y2 = 2.41f, x3 = 8.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 1.25f, x2 = 9.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 15.41f, y1 = 2.75f, x2 = 15.0f, y2 = 2.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.0f, y = 7.0f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -2.2f, dy1 = 0.0f, dx2 = -4.0f, dy2 = 1.8f, dx3 = -4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = 1.8f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 2.2f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.8f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = -1.8f, dy2 = -4.0f, dx3 = -4.0f, dy3 = -4.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.37f, y = 9.89f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.24f, dx2 = -0.85f, dy2 = -0.47f, dx3 = -1.73f, dy3 = -0.24f)
                lineToRelative(dx = -2.73f, dy = 0.75f)
                arcToRelative(a = 1.84f, b = 1.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.4f, dy1 = 1.83f)
                verticalLineToRelative(dy = 3.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.62f, dy1 = -0.1f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.24f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.12f, dy1 = -2.12f)
                verticalLineToRelative(dy = -3.34f)
                lineToRelative(dx = 3.52f, dy = -0.96f)
                verticalLineToRelative(dy = 1.37f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.62f, dy1 = -0.1f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.24f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.11f, dy1 = -2.07f)
                lineToRelative(dx = 0.01f, dy = -0.05f)
                verticalLineToRelative(dy = -5.35f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.9f, dx2 = -0.36f, dy2 = -1.37f, dx3 = -0.66f, dy3 = -1.6f)
                moveToRelative(dx = -6.48f, dy = 8.47f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.62f, dy1 = -0.62f)
                arcToRelative(a = 0.62f, b = 0.62f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.24f, dy1 = -0.01f)
                arcToRelative(a = 0.63f, b = 0.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.62f, dy1 = 0.63f)
                moveToRelative(dx = 5.02f, dy = -0.91f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.62f, dy1 = -0.62f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.62f, dy1 = -0.62f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.62f, dy1 = 0.62f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.62f, dy1 = 0.62f)
            }
        }.build().also { _musicPlaylist = it }
    }

@Suppress("ObjectPropertyName")
private var _musicPlaylist: ImageVector? = null
