package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageSquare: ImageVector
    get() {
        val current = _messageSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.28f, y = 9.76f)
                verticalLineToRelative(dy = 3.14f)
                lineToRelative(dx = -0.03f, dy = 0.6f)
                quadToRelative(dx1 = -0.27f, dy1 = 3.17f, dx2 = -3.73f, dy2 = 3.17f)
                horizontalLineToRelative(dx = -0.31f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.25f)
                lineToRelative(dx = -0.94f, dy = 1.26f)
                curveToRelative(dx1 = -0.42f, dy1 = 0.56f, dx2 = -1.09f, dy2 = 0.56f, dx3 = -1.51f, dy3 = 0.0f)
                lineToRelative(dx = -0.94f, dy = -1.26f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -0.25f)
                horizontalLineTo(x = 9.51f)
                curveToRelative(dx1 = -2.51f, dy1 = 0.0f, dx2 = -3.76f, dy2 = -0.62f, dx3 = -3.76f, dy3 = -3.76f)
                verticalLineTo(y = 9.77f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.45f, dx2 = 3.18f, dy2 = -3.73f)
                lineToRelative(dx = 0.59f, dy = -0.03f)
                horizontalLineToRelative(dx = 5.03f)
                quadToRelative(dx1 = 3.72f, dy1 = 0.0f, dx2 = 3.73f, dy2 = 3.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
        }.build().also { _messageSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _messageSquare: ImageVector? = null
