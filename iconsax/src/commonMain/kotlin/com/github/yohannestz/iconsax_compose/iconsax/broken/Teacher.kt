package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Teacher: ImageVector
    get() {
        val current = _teacher
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Teacher",
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
                moveTo(x = 6.0f, y = 5.17f)
                lineTo(x = 4.03f, y = 6.46f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.34f)
                lineToRelative(dx = 6.02f, dy = 3.93f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.94f, dy1 = 0.0f)
                lineToRelative(dx = 5.99f, dy = -3.93f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.33f)
                lineToRelative(dx = -5.99f, dy = -3.93f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.94f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.63f, y = 13.08f)
                verticalLineToRelative(dy = 4.69f)
                arcTo(horizontalEllipseRadius = 3.4f, verticalEllipseRadius = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.8f, y1 = 20.8f)
                lineToRelative(dx = 3.2f, dy = 1.06f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.01f, dy1 = 0.0f)
                lineToRelative(dx = 3.2f, dy = -1.06f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.17f, dy1 = -3.03f)
                verticalLineToRelative(dy = -4.64f)
                moveTo(x = 21.4f, y = 15.0f)
                verticalLineTo(y = 9.0f)
            }
        }.build().also { _teacher = it }
    }

@Suppress("ObjectPropertyName")
private var _teacher: ImageVector? = null
