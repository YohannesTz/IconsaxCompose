package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SecurityUser: ImageVector
    get() {
        val current = _securityUser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SecurityUser",
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
                moveTo(x = 10.49f, y = 2.23f)
                lineTo(x = 5.5f, y = 4.1f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = 3.02f)
                verticalLineToRelative(dy = 7.43f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = 3.44f)
                lineToRelative(dx = 4.3f, dy = 3.21f)
                arcToRelative(a = 4.55f, b = 4.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.14f, dy1 = 0.0f)
                lineToRelative(dx = 4.3f, dy = -3.21f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = -3.44f)
                verticalLineTo(y = 7.12f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = -3.02f)
                lineToRelative(dx = -4.99f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.04f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 10.92f)
                horizontalLineToRelative(dx = -0.13f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.13f, dy1 = 0.0f)
                moveToRelative(dx = -1.99f, dy = 2.8f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.64f, dx2 = -0.96f, dy2 = 1.69f, dx3 = 0.0f, dy3 = 2.33f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.97f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.96f, dy1 = -0.64f, dx2 = 0.96f, dy2 = -1.69f, dx3 = 0.0f, dy3 = -2.33f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.97f, dy1 = 0.0f)
            }
        }.build().also { _securityUser = it }
    }

@Suppress("ObjectPropertyName")
private var _securityUser: ImageVector? = null
