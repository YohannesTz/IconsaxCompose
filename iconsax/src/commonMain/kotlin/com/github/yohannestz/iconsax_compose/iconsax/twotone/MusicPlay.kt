package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicPlay: ImageVector
    get() {
        val current = _musicPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MusicPlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.48f, y = 18.49f)
                verticalLineToRelative(dy = -2.92f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = -1.84f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 1.84f)
                verticalLineToRelative(dy = 2.81f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = 3.57f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = -3.57f)
                verticalLineToRelative(dy = -6.16f)
                arcToRelative(a = 9.9f, b = 9.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.95f, dy1 = -10.17f)
                curveToRelative(dx1 = 5.62f, dy1 = 0.0f, dx2 = 10.05f, dy2 = 4.55f, dx3 = 10.05f, dy3 = 10.06f)
                verticalLineToRelative(dy = 6.16f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = 3.57f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = -3.57f)
                verticalLineToRelative(dy = -2.81f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = -1.84f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 1.84f)
                verticalLineToRelative(dy = 3.03f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.53f, y = 9.12f)
                horizontalLineToRelative(dx = -0.81f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.53f, dy1 = 0.32f)
                lineToRelative(dx = -0.75f, dy = 1.5f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.0f)
                lineToRelative(dx = -1.84f, dy = -3.67f)
                curveToRelative(dx1 = -0.1f, dy1 = -0.2f, dx2 = -0.4f, dy2 = -0.22f, dx3 = -0.52f, dy3 = 0.0f)
                lineTo(x = 9.71f, y = 8.8f)
                arcTo(horizontalEllipseRadius = 0.6f, verticalEllipseRadius = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.2f, y1 = 9.12f)
                horizontalLineTo(x = 8.46f)
            }
        }.build().also { _musicPlay = it }
    }

@Suppress("ObjectPropertyName")
private var _musicPlay: ImageVector? = null
