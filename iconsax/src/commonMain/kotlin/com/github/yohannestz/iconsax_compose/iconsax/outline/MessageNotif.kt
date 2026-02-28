package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.81f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.8f, dy1 = -0.96f)
                lineToRelative(dx = -1.5f, dy = -2.0f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.21f, dy1 = -0.1f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -4.17f, dy1 = 0.0f, dx2 = -6.75f, dy2 = -1.13f, dx3 = -6.75f, dy3 = -6.75f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.42f, dx2 = 2.33f, dy2 = -6.75f, dx3 = 6.75f, dy3 = -6.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 14.41f, y1 = 2.75f, x2 = 14.0f, y2 = 2.75f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 4.42f, y1 = 2.75f, x2 = 2.75f, y2 = 4.42f, x3 = 2.75f, y3 = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.52f, dx2 = 1.55f, dy2 = 5.25f, dx3 = 5.25f, dy3 = 5.25f)
                horizontalLineToRelative(dx = 0.5f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.4f, dy1 = 0.7f)
                lineToRelative(dx = 1.5f, dy = 2.0f)
                curveToRelative(dx1 = 0.35f, dy1 = 0.46f, dx2 = 0.85f, dy2 = 0.46f, dx3 = 1.2f, dy3 = 0.0f)
                lineToRelative(dx = 1.5f, dy = -2.0f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.4f, dy1 = -0.7f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 5.25f, dy2 = -1.67f, dx3 = 5.25f, dy3 = -5.25f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.42f, dx2 = -2.33f, dy2 = 6.75f, dx3 = -6.75f, dy3 = 6.75f)
                horizontalLineToRelative(dx = -0.5f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.2f, dy1 = 0.1f)
                lineToRelative(dx = -1.5f, dy = 2.0f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.8f, dy1 = 0.96f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 12.0f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = -8.0f, dy = 0.0f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = 11.5f, dy = -4.25f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.5f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.79f, dx3 = -1.75f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = 0.79f, dy1 = 1.75f, dx2 = 1.75f, dy2 = 1.75f)
                reflectiveCurveToRelative(dx1 = 1.75f, dy1 = -0.79f, dx2 = 1.75f, dy2 = -1.75f)
                reflectiveCurveToRelative(dx1 = -0.79f, dy1 = -1.75f, dx2 = -1.75f, dy2 = -1.75f)
            }
        }.build().also { _messageNotif = it }
    }

@Suppress("ObjectPropertyName")
private var _messageNotif: ImageVector? = null
