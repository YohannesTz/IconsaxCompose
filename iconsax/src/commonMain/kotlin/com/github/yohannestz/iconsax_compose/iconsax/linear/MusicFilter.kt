package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicFilter: ImageVector
    get() {
        val current = _musicFilter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MusicFilter",
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
                moveTo(x = 2.0f, y = 3.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 2.0f, y = 9.0f)
                horizontalLineToRelative(dx = 9.0f)
                moveToRelative(dx = -9.0f, dy = 6.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveToRelative(dx = -6.0f, dy = 6.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.84f, y = 22.0f)
                arcToRelative(a = 2.18f, b = 2.18f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.36f)
                arcToRelative(a = 2.18f, b = 2.18f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 18.37f)
                verticalLineTo(y = 9.86f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.81f, dx2 = -1.14f, dy2 = -2.06f, dx3 = -2.29f, dy3 = -1.75f)
                lineTo(x = 15.36f, y = 9.3f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.34f, dy1 = 1.75f)
                verticalLineToRelative(dy = 8.77f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.82f, y = 20.55f)
                arcToRelative(a = 2.18f, b = 2.18f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.36f)
                arcToRelative(a = 2.18f, b = 2.18f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.36f)
                moveToRelative(dx = -5.8f, dy = -6.95f)
                lineTo(x = 22.0f, y = 11.42f)
            }
        }.build().also { _musicFilter = it }
    }

@Suppress("ObjectPropertyName")
private var _musicFilter: ImageVector? = null
