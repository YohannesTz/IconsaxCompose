package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Star: ImageVector
    get() {
        val current = _star
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Star",
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
                moveTo(x = 15.39f, y = 5.21f)
                lineToRelative(dx = 1.41f, dy = 2.82f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.13f, dy1 = 0.84f)
                lineToRelative(dx = 2.55f, dy = 0.42f)
                curveToRelative(dx1 = 1.63f, dy1 = 0.27f, dx2 = 2.01f, dy2 = 1.45f, dx3 = 0.84f, dy3 = 2.63f)
                lineToRelative(dx = -1.99f, dy = 1.99f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.41f, dy1 = 1.45f)
                lineToRelative(dx = 0.57f, dy = 2.46f)
                curveToRelative(dx1 = 0.45f, dy1 = 1.94f, dx2 = -0.59f, dy2 = 2.7f, dx3 = -2.3f, dy3 = 1.68f)
                lineToRelative(dx = -2.39f, dy = -1.42f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = 0.0f)
                lineToRelative(dx = -2.39f, dy = 1.42f)
                curveToRelative(dx1 = -1.71f, dy1 = 1.01f, dx2 = -2.75f, dy2 = 0.26f, dx3 = -2.3f, dy3 = -1.68f)
                lineToRelative(dx = 0.57f, dy = -2.46f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.41f, dy1 = -1.45f)
                lineTo(x = 6.7f, y = 11.92f)
                curveToRelative(dx1 = -1.17f, dy1 = -1.17f, dx2 = -0.79f, dy2 = -2.35f, dx3 = 0.84f, dy3 = -2.63f)
                lineToRelative(dx = 2.55f, dy = -0.42f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.13f, dy1 = -0.84f)
                lineToRelative(dx = 1.41f, dy = -2.82f)
                curveToRelative(dx1 = 0.75f, dy1 = -1.53f, dx2 = 1.99f, dy2 = -1.53f, dx3 = 2.76f, dy3 = 0.0f)
                moveTo(x = 8.0f, y = 5.0f)
                horizontalLineTo(x = 2.0f)
                moveToRelative(dx = 3.0f, dy = 14.0f)
                horizontalLineTo(x = 2.0f)
                moveToRelative(dx = 1.0f, dy = -7.0f)
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _star = it }
    }

@Suppress("ObjectPropertyName")
private var _star: ImageVector? = null
