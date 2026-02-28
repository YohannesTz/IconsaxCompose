package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Notification: ImageVector
    get() {
        val current = _notification
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Notification",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.02f, y = 2.91f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.0f, dy1 = 6.0f)
                verticalLineToRelative(dy = 2.89f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = 2.06f)
                lineTo(x = 4.3f, y = 15.77f)
                curveToRelative(dx1 = -0.71f, dy1 = 1.18f, dx2 = -0.22f, dy2 = 2.49f, dx3 = 1.08f, dy3 = 2.93f)
                arcToRelative(a = 21.0f, b = 21.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 13.27f, dy1 = 0.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -2.93f)
                lineToRelative(dx = -1.15f, dy = -1.91f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = -2.06f)
                verticalLineTo(y = 8.91f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.3f, dx2 = -2.7f, dy2 = -6.0f, dx3 = -6.0f, dy3 = -6.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.87f, y = 3.2f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.7f, dy1 = 0.0f)
                arcToRelative(a = 1.99f, b = 1.99f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.7f, dy1 = 0.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.02f, y = 19.06f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.12f, dy1 = 2.12f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = -2.12f)
            }
        }.build().also { _notification = it }
    }

@Suppress("ObjectPropertyName")
private var _notification: ImageVector? = null
