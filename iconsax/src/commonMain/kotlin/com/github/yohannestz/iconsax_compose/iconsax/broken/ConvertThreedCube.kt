package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConvertThreedCube: ImageVector
    get() {
        val current = _convertThreedCube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ConvertThreedCube",
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
                moveTo(x = 22.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 2.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 7.95f, y = 3.75f)
                moveToRelative(dx = 5.75f, dy = 0.7f)
                lineToRelative(dx = 3.98f, dy = 2.3f)
                lineToRelative(dx = 3.94f, dy = -2.29f)
                moveToRelative(dx = -3.94f, dy = 6.36f)
                verticalLineTo(y = 6.74f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.74f, y = 2.21f)
                lineToRelative(dx = -2.4f, dy = 1.33f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 1.68f)
                verticalLineToRelative(dy = 2.54f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.68f)
                lineToRelative(dx = 2.4f, dy = 1.33f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.86f, dy1 = 0.0f)
                lineToRelative(dx = 2.4f, dy = -1.33f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.68f)
                verticalLineTo(y = 5.22f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.68f)
                lineToRelative(dx = -2.4f, dy = -1.33f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.87f, dy1 = 0.0f)
                moveTo(x = 2.35f, y = 15.45f)
                lineToRelative(dx = 3.97f, dy = 2.3f)
                lineToRelative(dx = 3.95f, dy = -2.29f)
                moveToRelative(dx = -3.95f, dy = 6.36f)
                verticalLineToRelative(dy = -4.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.65f, y = 16.23f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = -1.68f)
                lineToRelative(dx = -2.4f, dy = -1.33f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.87f, dy1 = 0.0f)
                lineToRelative(dx = -2.4f, dy = 1.33f)
                arcTo(horizontalEllipseRadius = 2.1f, verticalEllipseRadius = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 16.23f)
                verticalLineToRelative(dy = 2.54f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.99f, dy1 = 1.68f)
                lineToRelative(dx = 2.4f, dy = 1.33f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.87f, dy1 = 0.0f)
                lineToRelative(dx = 2.4f, dy = -1.33f)
            }
        }.build().also { _convertThreedCube = it }
    }

@Suppress("ObjectPropertyName")
private var _convertThreedCube: ImageVector? = null
