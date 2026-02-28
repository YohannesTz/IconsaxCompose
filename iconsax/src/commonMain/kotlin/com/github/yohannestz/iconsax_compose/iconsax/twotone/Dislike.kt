package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dislike: ImageVector
    get() {
        val current = _dislike
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dislike",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.52f, y = 5.65f)
                lineToRelative(dx = -3.1f, dy = -2.4f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.4f, dx2 = -1.3f, dy2 = -0.6f, dx3 = -1.9f, dy3 = -0.6f)
                horizontalLineToRelative(dx = -3.8f)
                curveToRelative(dx1 = -1.2f, dy1 = 0.0f, dx2 = -2.5f, dy2 = 0.9f, dx3 = -2.8f, dy3 = 2.1f)
                lineToRelative(dx = -2.4f, dy = 7.3f)
                curveToRelative(dx1 = -0.5f, dy1 = 1.4f, dx2 = 0.4f, dy2 = 2.6f, dx3 = 1.9f, dy3 = 2.6f)
                horizontalLineToRelative(dx = 4.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.2f)
                lineToRelative(dx = -0.5f, dy = 3.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.3f, dy1 = 2.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.2f, dy1 = -0.7f)
                lineToRelative(dx = 4.1f, dy = -6.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.62f, y = 5.65f)
                verticalLineToRelative(dy = 9.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.4f, dx2 = -0.6f, dy2 = 1.9f, dx3 = -2.0f, dy3 = 1.9f)
                horizontalLineToRelative(dx = -1.0f)
                curveToRelative(dx1 = -1.4f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.5f, dx3 = -2.0f, dy3 = -1.9f)
                verticalLineToRelative(dy = -9.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.4f, dx2 = 0.6f, dy2 = -1.9f, dx3 = 2.0f, dy3 = -1.9f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.5f, dx3 = 2.0f, dy3 = 1.9f)
            }
        }.build().also { _dislike = it }
    }

@Suppress("ObjectPropertyName")
private var _dislike: ImageVector? = null
