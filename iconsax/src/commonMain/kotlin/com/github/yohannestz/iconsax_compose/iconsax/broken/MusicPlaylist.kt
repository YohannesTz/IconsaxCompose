package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.5f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.5f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.5f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -0.83f)
                moveTo(x = 16.0f, y = 4.5f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -12.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 7.17f)
                moveTo(x = 9.0f, y = 2.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.89f, y = 19.11f)
                arcToRelative(a = 1.37f, b = 1.37f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.74f)
                arcToRelative(a = 1.37f, b = 1.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.74f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.28f, y = 16.83f)
                verticalLineToRelative(dy = -5.35f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.14f, dx2 = -0.71f, dy2 = -1.3f, dx3 = -1.44f, dy3 = -1.1f)
                lineToRelative(dx = -2.74f, dy = 0.75f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.84f, dy1 = 1.1f)
                verticalLineToRelative(dy = 5.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.91f, y = 18.2f)
                arcToRelative(a = 1.37f, b = 1.37f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.74f)
                arcToRelative(a = 1.37f, b = 1.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.74f)
                close()
                moveToRelative(dx = -3.65f, dy = -4.37f)
                lineToRelative(dx = 5.02f, dy = -1.37f)
            }
        }.build().also { _musicPlaylist = it }
    }

@Suppress("ObjectPropertyName")
private var _musicPlaylist: ImageVector? = null
