package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageNotif: ImageVector
    get() {
        val current = _messageNotif
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageNotif",
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
                moveTo(x = 2.0f, y = 8.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = 6.0f, dy2 = -6.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveToRelative(dx = 8.0f, dy = 8.0f)
                verticalLineToRelative(dy = 3.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 6.0f, dx2 = -6.0f, dy2 = 6.0f)
                horizontalLineToRelative(dx = -0.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.4f)
                lineToRelative(dx = -1.5f, dy = 2.0f)
                curveToRelative(dx1 = -0.66f, dy1 = 0.88f, dx2 = -1.74f, dy2 = 0.88f, dx3 = -2.4f, dy3 = 0.0f)
                lineToRelative(dx = -1.5f, dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.1f, verticalEllipseRadius = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 19.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -1.0f, dx3 = -6.0f, dy3 = -6.0f)
                verticalLineToRelative(dy = -1.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 4.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.5f, y1 = 7.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 16.0f, y = 11.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
            }
        }.build().also { _messageNotif = it }
    }

@Suppress("ObjectPropertyName")
private var _messageNotif: ImageVector? = null
